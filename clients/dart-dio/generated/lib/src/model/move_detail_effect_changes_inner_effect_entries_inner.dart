//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_effect_changes_inner_effect_entries_inner.g.dart';

/// MoveDetailEffectChangesInnerEffectEntriesInner
///
/// Properties:
/// * [effect] 
/// * [language] 
@BuiltValue()
abstract class MoveDetailEffectChangesInnerEffectEntriesInner implements Built<MoveDetailEffectChangesInnerEffectEntriesInner, MoveDetailEffectChangesInnerEffectEntriesInnerBuilder> {
  @BuiltValueField(wireName: r'effect')
  String get effect;

  @BuiltValueField(wireName: r'language')
  AbilityDetailPokemonInnerPokemon get language;

  MoveDetailEffectChangesInnerEffectEntriesInner._();

  factory MoveDetailEffectChangesInnerEffectEntriesInner([void updates(MoveDetailEffectChangesInnerEffectEntriesInnerBuilder b)]) = _$MoveDetailEffectChangesInnerEffectEntriesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailEffectChangesInnerEffectEntriesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailEffectChangesInnerEffectEntriesInner> get serializer => _$MoveDetailEffectChangesInnerEffectEntriesInnerSerializer();
}

class _$MoveDetailEffectChangesInnerEffectEntriesInnerSerializer implements PrimitiveSerializer<MoveDetailEffectChangesInnerEffectEntriesInner> {
  @override
  final Iterable<Type> types = const [MoveDetailEffectChangesInnerEffectEntriesInner, _$MoveDetailEffectChangesInnerEffectEntriesInner];

  @override
  final String wireName = r'MoveDetailEffectChangesInnerEffectEntriesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailEffectChangesInnerEffectEntriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect';
    yield serializers.serialize(
      object.effect,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailEffectChangesInnerEffectEntriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailEffectChangesInnerEffectEntriesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.effect = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailEffectChangesInnerEffectEntriesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailEffectChangesInnerEffectEntriesInnerBuilder();
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

