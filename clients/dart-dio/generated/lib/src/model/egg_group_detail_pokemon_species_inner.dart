//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'egg_group_detail_pokemon_species_inner.g.dart';

/// EggGroupDetailPokemonSpeciesInner
///
/// Properties:
/// * [name] - Pokemon species name.
/// * [url] - The URL to get more information about the species
@BuiltValue()
abstract class EggGroupDetailPokemonSpeciesInner implements Built<EggGroupDetailPokemonSpeciesInner, EggGroupDetailPokemonSpeciesInnerBuilder> {
  /// Pokemon species name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The URL to get more information about the species
  @BuiltValueField(wireName: r'url')
  String? get url;

  EggGroupDetailPokemonSpeciesInner._();

  factory EggGroupDetailPokemonSpeciesInner([void updates(EggGroupDetailPokemonSpeciesInnerBuilder b)]) = _$EggGroupDetailPokemonSpeciesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EggGroupDetailPokemonSpeciesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EggGroupDetailPokemonSpeciesInner> get serializer => _$EggGroupDetailPokemonSpeciesInnerSerializer();
}

class _$EggGroupDetailPokemonSpeciesInnerSerializer implements PrimitiveSerializer<EggGroupDetailPokemonSpeciesInner> {
  @override
  final Iterable<Type> types = const [EggGroupDetailPokemonSpeciesInner, _$EggGroupDetailPokemonSpeciesInner];

  @override
  final String wireName = r'EggGroupDetailPokemonSpeciesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EggGroupDetailPokemonSpeciesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EggGroupDetailPokemonSpeciesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EggGroupDetailPokemonSpeciesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EggGroupDetailPokemonSpeciesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EggGroupDetailPokemonSpeciesInnerBuilder();
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

