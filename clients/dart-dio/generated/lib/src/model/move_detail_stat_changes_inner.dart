//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_stat_changes_inner.g.dart';

/// MoveDetailStatChangesInner
///
/// Properties:
/// * [change] 
/// * [stat] 
@BuiltValue()
abstract class MoveDetailStatChangesInner implements Built<MoveDetailStatChangesInner, MoveDetailStatChangesInnerBuilder> {
  @BuiltValueField(wireName: r'change')
  int get change;

  @BuiltValueField(wireName: r'stat')
  AbilityDetailPokemonInnerPokemon get stat;

  MoveDetailStatChangesInner._();

  factory MoveDetailStatChangesInner([void updates(MoveDetailStatChangesInnerBuilder b)]) = _$MoveDetailStatChangesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailStatChangesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailStatChangesInner> get serializer => _$MoveDetailStatChangesInnerSerializer();
}

class _$MoveDetailStatChangesInnerSerializer implements PrimitiveSerializer<MoveDetailStatChangesInner> {
  @override
  final Iterable<Type> types = const [MoveDetailStatChangesInner, _$MoveDetailStatChangesInner];

  @override
  final String wireName = r'MoveDetailStatChangesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailStatChangesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'change';
    yield serializers.serialize(
      object.change,
      specifiedType: const FullType(int),
    );
    yield r'stat';
    yield serializers.serialize(
      object.stat,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailStatChangesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailStatChangesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'change':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.change = valueDes;
          break;
        case r'stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.stat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailStatChangesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailStatChangesInnerBuilder();
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

