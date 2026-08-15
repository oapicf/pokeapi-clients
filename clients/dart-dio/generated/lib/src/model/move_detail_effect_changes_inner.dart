//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/move_detail_effect_changes_inner_effect_entries_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_effect_changes_inner.g.dart';

/// MoveDetailEffectChangesInner
///
/// Properties:
/// * [effectEntries] 
/// * [versionGroup] 
@BuiltValue()
abstract class MoveDetailEffectChangesInner implements Built<MoveDetailEffectChangesInner, MoveDetailEffectChangesInnerBuilder> {
  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<MoveDetailEffectChangesInnerEffectEntriesInner> get effectEntries;

  @BuiltValueField(wireName: r'version_group')
  AbilityDetailPokemonInnerPokemon get versionGroup;

  MoveDetailEffectChangesInner._();

  factory MoveDetailEffectChangesInner([void updates(MoveDetailEffectChangesInnerBuilder b)]) = _$MoveDetailEffectChangesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailEffectChangesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailEffectChangesInner> get serializer => _$MoveDetailEffectChangesInnerSerializer();
}

class _$MoveDetailEffectChangesInnerSerializer implements PrimitiveSerializer<MoveDetailEffectChangesInner> {
  @override
  final Iterable<Type> types = const [MoveDetailEffectChangesInner, _$MoveDetailEffectChangesInner];

  @override
  final String wireName = r'MoveDetailEffectChangesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailEffectChangesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(MoveDetailEffectChangesInnerEffectEntriesInner)]),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailEffectChangesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailEffectChangesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveDetailEffectChangesInnerEffectEntriesInner)]),
          ) as BuiltList<MoveDetailEffectChangesInnerEffectEntriesInner>;
          result.effectEntries.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailEffectChangesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailEffectChangesInnerBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

