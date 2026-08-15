//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokeathlon_stat_detail_affecting_natures_decrease_inner.g.dart';

/// PokeathlonStatDetailAffectingNaturesDecreaseInner
///
/// Properties:
/// * [maxChange] 
/// * [nature] 
@BuiltValue()
abstract class PokeathlonStatDetailAffectingNaturesDecreaseInner implements Built<PokeathlonStatDetailAffectingNaturesDecreaseInner, PokeathlonStatDetailAffectingNaturesDecreaseInnerBuilder> {
  @BuiltValueField(wireName: r'max_change')
  int get maxChange;

  @BuiltValueField(wireName: r'nature')
  AbilityDetailPokemonInnerPokemon get nature;

  PokeathlonStatDetailAffectingNaturesDecreaseInner._();

  factory PokeathlonStatDetailAffectingNaturesDecreaseInner([void updates(PokeathlonStatDetailAffectingNaturesDecreaseInnerBuilder b)]) = _$PokeathlonStatDetailAffectingNaturesDecreaseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokeathlonStatDetailAffectingNaturesDecreaseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokeathlonStatDetailAffectingNaturesDecreaseInner> get serializer => _$PokeathlonStatDetailAffectingNaturesDecreaseInnerSerializer();
}

class _$PokeathlonStatDetailAffectingNaturesDecreaseInnerSerializer implements PrimitiveSerializer<PokeathlonStatDetailAffectingNaturesDecreaseInner> {
  @override
  final Iterable<Type> types = const [PokeathlonStatDetailAffectingNaturesDecreaseInner, _$PokeathlonStatDetailAffectingNaturesDecreaseInner];

  @override
  final String wireName = r'PokeathlonStatDetailAffectingNaturesDecreaseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokeathlonStatDetailAffectingNaturesDecreaseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'max_change';
    yield serializers.serialize(
      object.maxChange,
      specifiedType: const FullType(int),
    );
    yield r'nature';
    yield serializers.serialize(
      object.nature,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokeathlonStatDetailAffectingNaturesDecreaseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokeathlonStatDetailAffectingNaturesDecreaseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max_change':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChange = valueDes;
          break;
        case r'nature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.nature.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokeathlonStatDetailAffectingNaturesDecreaseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokeathlonStatDetailAffectingNaturesDecreaseInnerBuilder();
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

